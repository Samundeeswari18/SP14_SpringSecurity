package com.sam.sp14_spring_security.service;

import com.sam.sp14_spring_security.JPA_Entity.Role;

import java.util.List;

public interface RoleService {
    public void saveRole(Role role);
    public Role findRoleByRoleName(String name);
    public List<Role> getAllRoles();
    public List<Role> getRolesByUser(long id);
}