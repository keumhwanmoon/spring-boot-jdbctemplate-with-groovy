package com.jason.repository;

import com.jason.domain.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author jason, Moon
 * @since 2016. 9. 6.
 */
@Repository
public class MemberRepository {

    private final NamedParameterJdbcTemplate jdbcTemplate;

    @Autowired
    public MemberRepository(NamedParameterJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Member> findMembers() {
        return jdbcTemplate.query(MemberQuery.findMembers(), new BeanPropertyRowMapper<>(Member.class));
    }

    public List<Member> findMembers(String memberName) {
        return jdbcTemplate.query(MemberQuery.findMembers(memberName), new BeanPropertyRowMapper<>(Member.class));
    }
}
