package company.service;

import company.entity.BhCompany;
import java.util.List;

/**
 * 企业表(BhCompany)表服务接口
 *
 * @author makejava
 * @since 2022-04-12 15:05:21
 */
public interface BhCompanyService {

    /**
     * 通过ID查询单条数据
     *
     * @param companyId 主键
     * @return 实例对象
     */
    BhCompany queryById(Long companyId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<BhCompany> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param bhCompany 实例对象
     * @return 实例对象
     */
    BhCompany insert(BhCompany bhCompany);

    /**
     * 修改数据
     *
     * @param bhCompany 实例对象
     * @return 实例对象
     */
    BhCompany update(BhCompany bhCompany);

    /**
     * 通过主键删除数据
     *
     * @param companyId 主键
     * @return 是否成功
     */
    boolean deleteById(Long companyId);

}