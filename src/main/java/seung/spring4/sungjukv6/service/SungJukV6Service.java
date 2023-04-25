package seung.spring4.sungjukv6.service;


import seung.spring4.sungjukv6.model.SungJukVO;

import java.util.List;

public interface SungJukV6Service {

    void newSungJuk();
    List<SungJukVO> readSungJuk();
    void readOneSungJuk();
    void modifySungJuk();
    void removeSungJuk();
    void computeSungJuk(SungJukVO sj);

}