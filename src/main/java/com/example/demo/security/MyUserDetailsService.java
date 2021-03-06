package com.example.demo.security;


import java.util.Collections;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.example.demo.model.Usuario;
import com.example.demo.repository.UsuarioRepository;

@Component
public class MyUserDetailsService implements UserDetailsService {

    @Autowired private UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<Usuario> userRes = usuarioRepository.findByEmail(email);
        if(userRes.isEmpty())
            throw new UsernameNotFoundException("Could not findUser with email = " + email);
        Usuario user = userRes.get();
        return new org.springframework.security.core.userdetails.User(
                email,
                user.getPassword(),
                Collections.singletonList(new SimpleGrantedAuthority("ROLE_USER")));
    }
}
