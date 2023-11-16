package com.dealership.configuration;//package com.dealership.apispringbootdealership.configuration;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {



//    @Override
//    protected void configure(HttpSecurity httpSecurity) throws Exception {
//        httpSecurity.authorizeRequests()
//                .antMatchers("/").permitAll()
//                .antMatchers("/auth/user/*").hasAnyAuthority("USER", "ADMIN")
//                .antMatchers("/auth/admin/*").hasAnyAuthority("ADMIN")
//                .antMatchers("/user/admin/*").hasAnyAuthority("ADMIN")
//                .and()
//                .exceptionHandling().accessDeniedPage("Access Denied!")
//                .and()
//                .formLogin()
//                .loginPage("/login").permitAll()
//                .and()
//                .logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
//                .logoutSuccessUrl("/").permitAll();
//    }

//}
