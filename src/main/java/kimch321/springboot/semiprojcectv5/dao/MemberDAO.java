package kimch321.springboot.semiprojcectv5.dao;

import kimch321.springboot.semiprojcectv5.model.Member;

public interface MemberDAO {
    int selectLogin(Member m);
}
