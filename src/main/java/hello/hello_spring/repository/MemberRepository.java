package hello.hello_spring.repository;

import hello.hello_spring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member); // 회원 저장
    Optional<Member> findById(Long id); // id로 찾아오기
    Optional<Member> findByName(String name); // name으로 찾아오기
    List<Member> findAll(); // 모든 회원 조회
}
