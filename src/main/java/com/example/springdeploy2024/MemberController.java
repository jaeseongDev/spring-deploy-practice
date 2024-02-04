package com.example.springdeploy2024;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

  private MemberRepository memberRepository;

  public MemberController(MemberRepository memberRepository) {
    this.memberRepository = memberRepository;
  }

  @GetMapping("/health")
  public String health() {
    return "헬쓰 체크 성공!";
  }

  @GetMapping("/members")
  public List<Member> getMembers() {
    return memberRepository.findAll();
  }
}
