package seung.spring4.sungjukv6.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import seung.spring4.sungjukv6.model.SungJukVO;

import java.util.List;

@Repository("sjdao")
public class SungJukV6DAOImpl implements SungJukV4DAO {

    private static final Logger Logger = LogManager.getLogger(SungJukV6DAOImpl.class);
    // debug, info(!), warn, error(!), fatal
    private SqlSession sqlSession;

    // jdbc.properties 에 정의한 SQL 가져오기
    /*@Value("#{sql['insertSQL']}") private String insertSQL;
    @Value("#{sql['selectSQL']}") private String selectSQL;
    @Value("#{sql['selectOneSQL']}") private String selectOneSQL;
    @Value("#{sql['updateSQL']}") private String updateSQL;
    @Value("#{sql['deleteSQL']}") private String deleteSQL;*/

    @Autowired
    public SungJukV6DAOImpl(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public int insertSungJuk(SungJukVO sj) {
        return sqlSession.insert("sungjuk.insertsql", sj);
    }

    @Override
    public List<SungJukVO> selectSungJuk() {
        return sqlSession.selectList("sungjuk.selectsql");
    }

    @Override
    public SungJukVO selectOneSungJuk(int sjno) {
        return sqlSession.selectOne("sungjuk.selectonesql", sjno);
    }


    @Override
    public int updateSungJuk(SungJukVO sj) {
        return sqlSession.update("sungjuk.updatesql", sj);
    }

    @Override
    public int deleteSungJuk(int sjno) {
        return sqlSession.delete("sungjuk.deletesql", sjno);
    }


}