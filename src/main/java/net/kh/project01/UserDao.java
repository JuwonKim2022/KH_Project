package net.kh.project01;

public interface UserDao {
    int deleteUser(String id);

    User2 selectUser(String id);

    // 사용자 정보를 user_info테이블에 저장하는 메서드
    int insertUser(User2 user);

    // 매개변수로 받은 사용자 정보로 user_info테이블을 update하는 메서드
    int updateUser(User2 user);

    void deleteAll() throws Exception;
}
