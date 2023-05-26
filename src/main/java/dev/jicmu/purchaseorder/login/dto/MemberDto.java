package dev.jicmu.purchaseorder.login.dto;

import dev.jicmu.purchaseorder.login.ROLE;
import dev.jicmu.purchaseorder.login.entity.Member;
import lombok.*;

@Getter
@Setter
@Builder
@EqualsAndHashCode
@NoArgsConstructor
public class MemberDto {

    private Long num;
    private String userid;
    private String password;
    private String name;
    private ROLE role;


    @Builder
    public MemberDto(Long num, String userid, String password, String name, ROLE role) {
        this.num = num;
        this.userid = userid;
        this.password = password;
        this.name = name;
        this.role = ROLE.CONTRACT;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public MemberDto(Member member) {
        this.num = member.getNum();
        this.userid = member.getUserid();
        this.password = member.getPassword();
        this.name = member.getName();
        this.role = member.getRole();
    }

    public Member toEntity() {
        return Member.builder()
                .userid(this.userid)
                .password(this.password)
                .name(this.name)
                .role(this.role)
                .build();
    }

}
