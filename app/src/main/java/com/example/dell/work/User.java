package com.example.dell.work;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by DELL
 * on 2018/5/24.
 * at 北京
 */
@Entity
public class User {
    @Id(autoincrement = true)
    private Long id;
    @Property(nameInDb = "phone")
    private String phone;
    @Property(nameInDb = "psw")
    private String psw;
    @Generated(hash = 40966439)
    public User(Long id, String phone, String psw) {
        this.id = id;
        this.phone = phone;
        this.psw = psw;
    }
    @Generated(hash = 586692638)
    public User() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getPhone() {
        return this.phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getPsw() {
        return this.psw;
    }
    public void setPsw(String psw) {
        this.psw = psw;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", phone='" + phone + '\'' +
                ", psw='" + psw + '\'' +
                '}';
    }
}
