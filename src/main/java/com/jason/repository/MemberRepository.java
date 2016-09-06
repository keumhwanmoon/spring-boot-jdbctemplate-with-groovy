package com.jason.repository;

import com.jason.domain.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author jason, Moon
 * @since 2016. 9. 6.
 */
@Repository
public class MemberRepository {

//    @Autowired
//    NamedParameterJdbcTemplate jdbcTemplate;
//
//    BeansUtil
//
//    public List<Member> findMembers() {
//        return jdbcTemplate.query("select id, name form member");
//    }
}
