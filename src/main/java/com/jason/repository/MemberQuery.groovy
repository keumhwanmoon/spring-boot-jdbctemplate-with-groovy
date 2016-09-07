package com.jason.repository

import com.jason.util.QueryUtils
import org.springframework.util.StringUtils

/**
 * @author jason , Moon
 * @since 2016. 9. 7.
 */
class MemberQuery {
    public static String findMembers() {
        String query =
                '''
                SELECT id, name FROM MEMBER
                '''

        return query
    }

    static String findMembers(String memberName) {
        StringBuilder query = new StringBuilder(
                """
                SELECT id, name FROM MEMBER
                """)

        if ( !StringUtils.isEmpty(memberName) ) {
            query.append("WHERE ").append(QueryUtils.like("name", memberName))
        }

        return query;
    }
}
