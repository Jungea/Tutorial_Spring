package kr.co.mytutorial.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.co.mytutorial.dto.Department;

@Mapper
public interface DepartmentMapper {
	List<Department> findAll();
}