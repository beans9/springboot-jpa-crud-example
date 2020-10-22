package com.beans9.jpa.member;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {
	private final MemberService memberService;

	@GetMapping
	public List<Member> selectMembers() {
		return memberService.selectMembers();
	}

	@GetMapping("/{id}")
	public Member getMember(@PathVariable Long id) {
		return memberService.getMember(id);
	}

	@PostMapping
	public Member saveMember(@RequestBody Member member) {
		return memberService.saveMember(member);
	}

	@PutMapping("/{id}")
	public Member updateMember(@PathVariable Long id, @RequestBody Member member) {
		return memberService.updateMember(id, member);
	}

	@DeleteMapping
	@ResponseStatus(HttpStatus.OK)
	public void deleteMember(@PathVariable Long id) {
		memberService.deleteMember(id);
	}
}
