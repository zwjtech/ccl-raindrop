package com.ccl.querydsl.data.repository;

import com.ccl.rain.codegen.ModelQueryAndBatchUpdateRepository;

import com.ccl.querydsl.data.model.Users;

import com.ccl.querydsl.data.entity.EUsers;

import com.ccl.rain.codegen.Label;

/**
 * UsersRepository is a Querydsl repository interface type
 */
@Label("Users存储")
public interface UsersRepository extends ModelQueryAndBatchUpdateRepository<Users, EUsers, Integer> {

}

