/*
 * Copyright © 2013-2017 BLT, Co., Ltd. All Rights Reserved.
 */

package com.blt.talk.service.jpa.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.blt.talk.service.jpa.entity.IMDiscovery;

/**
 * im_discovery表对应JPARepository
 * 
 * @author 袁贵
 * @version 1.0
 * @since 1.0
 */
public interface IMDiscoveryRepository extends PagingAndSortingRepository<IMDiscovery, Long>, JpaSpecificationExecutor<IMDiscovery> {

}
