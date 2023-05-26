package dev.jicmu.purchaseorder.login;

import dev.jicmu.purchaseorder.login.dto.MemberDto;
import dev.jicmu.purchaseorder.login.repository.MemberRepository;
import dev.jicmu.purchaseorder.login.service.MemberService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class MemberServiceTest {

    @Autowired
    MemberService memberService;

    @Autowired
    MemberRepository memberRepository;


    @AfterEach
    public void clear() {
        memberRepository.deleteAll();
    }

    @Test
    public void save_Member() {
        // given
        MemberDto memberDto = MemberDto.builder()
                .userid("userid")
                .password("password")
                .name("name")
                .role(ROLE.CONTRACT)
                .build();

        // when
        memberService.join(memberDto);

        // then
        MemberDto searchedMemberDto = new MemberDto(memberRepository.findAll().get(0));
        searchedMemberDto.setNum(null);

        assertThat(memberDto).isEqualTo(searchedMemberDto);
    }

}