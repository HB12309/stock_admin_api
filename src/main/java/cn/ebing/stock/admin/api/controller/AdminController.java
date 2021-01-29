package cn.ebing.stock.admin.api.controller;

import cn.ebing.stock.admin.api.domain.response.AdminResponse;
import cn.ebing.stock.admin.api.service.AdminService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admins")
public class AdminController {

	private static Logger logger = LoggerFactory.getLogger(AdminController.class);

	@Autowired
	private AdminService adminService;

	@ResponseBody
	@GetMapping("/{adminId}")
	public AdminResponse getById(
			@PathVariable Long adminId
	) {
		return adminService.getById(adminId);
	}
}