package com.dealership.entity;//package com.dealership.apispringbootdealership.entity;
//
//import lombok.Data;
//import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.index.IndexDirection;
//import org.springframework.data.mongodb.core.index.Indexed;
//import org.springframework.data.mongodb.core.mapping.Document;
//import org.springframework.security.core.GrantedAuthority;
//
//@Data
//@Document(collection = "role")
//public class Role implements GrantedAuthority {
//    @Id
//    private String id;
//    @Indexed(unique = true, direction = IndexDirection.DESCENDING)
//    private String role;
//
//    @Override
//    public String getAuthority() {
//        return role;
//    }
//}