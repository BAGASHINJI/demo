package company.controller;

import company.entity.BhCompany;
import company.service.BhCompanyService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 企业表(BhCompany)表控制层
 *
 * @author makejava
 * @since 2022-04-12 15:05:22
 */
@RestController
@RequestMapping("bhCompany")
public class BhCompanyController {
    /**
     * 服务对象
     */
    @Resource
    private BhCompanyService bhCompanyService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public BhCompany selectOne(Long id) {
        return this.bhCompanyService.queryById(id);
    }

}