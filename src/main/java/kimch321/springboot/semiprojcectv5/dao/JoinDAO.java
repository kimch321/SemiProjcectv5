package kimch321.springboot.semiprojcectv5.dao;

import kimch321.springboot.semiprojcectv5.model.Member;
import kimch321.springboot.semiprojcectv5.model.Zipcode;

import java.util.List;

public interface JoinDAO {
    List<Zipcode> selectZipcode(String dong);
    int insertMember(Member m);
    int selectOneUserid(String uid);
    int selectOneMember(Member m);

}
