package cn.ebing.stock.admin.api.service;

import cn.ebing.stock.admin.api.domain.response.AdminResponse;

public interface AdminService {
	AdminResponse getById(Long id);
}
