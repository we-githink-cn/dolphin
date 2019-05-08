package cn.githink.upms.service;

import cn.githink.model.upms.sysuser.UserDto;
import cn.githink.model.upms.sysuser.bo.SysUserQueryBody;
import cn.githink.model.upms.sysuser.po.SysUser;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author 毛子坤
 * @Title:
 * @Package
 * @Description:
 * @date 2019/5/8 14:24
 */
public interface SysUserService extends IService<SysUser> {
    /**
     * 新增用户
     * @param userDto
     * @return
     */
    Boolean saveUser(UserDto userDto);
}