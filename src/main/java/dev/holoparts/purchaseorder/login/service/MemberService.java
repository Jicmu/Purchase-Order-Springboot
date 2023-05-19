package dev.holoparts.purchaseorder.login.service;

import dev.holoparts.purchaseorder.login.dto.MemberDto;
import dev.holoparts.purchaseorder.login.entity.Member;
import dev.holoparts.purchaseorder.login.repository.MemberRepository;
import jakarta.transaction.Transactional;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    private final PasswordEncoder passwordEncoder;

    public Member join(MemberDto memberDto) {
        memberDto.setPassword(passwordEncoder.encode(memberDto.getPassword()));

        Member entity = memberDto.toEntity();
        memberRepository.save(entity);

        return entity;
    }

    public Optional<Member> findById(Long num) {
        return memberRepository.findById(num);
    }

    public Optional<Member> findByUserId(String userid) {
        return memberRepository.findByUserId(userid);
    }

}
