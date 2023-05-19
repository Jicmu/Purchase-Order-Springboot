package dev.holoparts.purchaseorder.login.repository;

import dev.holoparts.purchaseorder.login.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {

    @Query("SELECT m FROM Member m WHERE m.userid = :userid")
    public Optional<Member> findByUserId(@Param("userid") String userid);

}
