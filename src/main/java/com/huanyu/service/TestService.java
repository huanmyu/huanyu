package com.huanyu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.huanyu.domain.WoProductResourceRecord;

@Component
public class TestService {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public TestService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int getCount() {
        createData();
        return this.jdbcTemplate.queryForObject("select count(*) from wo_product_resource_record", Integer.class);
    }

    public void createData() {
        this.jdbcTemplate.update(
                "insert into rancheck_main (username) values (?)",
                "huanhuan");
        this.jdbcTemplate.update(
                "insert into rancheck_main (username) values (?)",
                "huanyu");
        this.jdbcTemplate.update(
                "insert into wo_product_resource_record (username, productno) values (?,?)",
                "huanhuan", "a");
        this.jdbcTemplate.update(
                "insert into wo_product_resource_record (username, productno) values (?,?)",
                "huanyu", "b");
    }

    public List<WoProductResourceRecord> getData() {
        String sql = "select r.id, q.productno, q.username from wo_product_resource_record q left join rancheck_main r on r.username=q.username where q.productno in ('a' , 'b')";
        List<WoProductResourceRecord> result=this.jdbcTemplate.query(sql, new BeanPropertyRowMapper<WoProductResourceRecord>(WoProductResourceRecord.class));
        return result;
    }
}