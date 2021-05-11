package com.springframework.tacocloud.domains.taco;


import org.springframework.data.repository.PagingAndSortingRepository;

public interface TacoRepository extends PagingAndSortingRepository<Taco,Long> {

}
