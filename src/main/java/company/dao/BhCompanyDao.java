package company.dao;

import company.entity.BhCompany;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 企业表(BhCompany)表数据库访问层
 *
 * @author makejava
 * @since 2022-04-12 15:05:20
 */
public interface BhCompanyDao {

    /**
     * 通过ID查询单条数据
     *
     * @param companyId 主键
     * @return 实例对象
     */
    BhCompany queryById(Long companyId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<BhCompany> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param bhCompany 实例对象
     * @return 对象列表
     */
    List<BhCompany> queryAll(BhCompany bhCompany);

    /**
     * 新增数据
     *
     * @param bhCompany 实例对象
     * @return 影响行数
     */
    int insert(BhCompany bhCompany);

    /**
     * 修改数据
     *
     * @param bhCompany 实例对象
     * @return 影响行数
     */
    int update(BhCompany bhCompany);

    /**
     * 通过主键删除数据
     *
     * @param companyId 主键
     * @return 影响行数
     */
    int deleteById(Long companyId);

}