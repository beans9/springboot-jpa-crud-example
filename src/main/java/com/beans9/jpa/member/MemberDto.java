package com.beans9.jpa.member;

import lombok.Data;

@Data
public class MemberDto {
	private String name;
	private String address;

	public Member toEntity() {
		return Member.builder()
			.name(this.name)
			.address(this.address).build();
	}
}
