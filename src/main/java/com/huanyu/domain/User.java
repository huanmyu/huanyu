package com.huanyu.domain;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class User implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue
    private Long userId;
    
    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;
    
    protected User() {
        // no-args constructor required by JPA spec
        // this one is protected since it shouldn't be used directly
    }

	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
    
    
}
