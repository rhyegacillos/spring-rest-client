package com.springframework.rest.springrestclient.service;

import com.springframework.rest.springrestclient.domain.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface ApiService {

    List<User> getUsers(Integer limit);

    Flux getUsers(Mono<Integer> limit);

}
