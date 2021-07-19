package hello.core.member;

import java.util.Arrays;

public class MemberApp {

    public static void main(String[] args) { //psvm 누르고 치니깐 자동으로 완성
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "memberA", Grade.VIP);  //ctr + shift + v 단축키 사용하면 memberA 자동생성
        //id는 Long 타입이기때문에 1L로 붙여준거
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("new member = " + member.getName());
        System.out.println("findMember = " + findMember.getName());
    }
}
