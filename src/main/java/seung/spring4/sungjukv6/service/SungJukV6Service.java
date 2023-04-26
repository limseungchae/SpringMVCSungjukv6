package seung.spring4.sungjukv6.service;


import seung.spring4.sungjukv6.model.SungJukVO;

import java.util.List;

public interface SungJukV6Service {

    boolean newSungJuk(SungJukVO sj);
    List<SungJukVO> readSungJuk();
    SungJukVO readOneSungJuk(int sjno);
    boolean modifySungJuk(SungJukVO sj);
    boolean removeSungJuk(int sjno);
    void computeSungJuk(SungJukVO sj);

}