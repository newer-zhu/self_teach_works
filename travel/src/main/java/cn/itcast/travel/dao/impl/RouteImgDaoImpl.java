package cn.itcast.travel.dao.impl;

import cn.itcast.travel.domain.RouteImg;
import cn.itcast.travel.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class RouteImgDaoImpl implements cn.itcast.travel.dao.RouteImgDao {
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
    @Override
    public List<RouteImg> findImg(int rid) {
        String sql = "select * from tab_route_img where rid = ?";
        List<RouteImg> imgs = template.query(sql, new BeanPropertyRowMapper<RouteImg>(RouteImg.class),rid);
        return imgs;

    }
}