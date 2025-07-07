package cn.oldbaby.sip.common.mapper;

import cn.oldbaby.sip.common.domain.SipPhotoColor;

import java.util.List;

/**
* @author mickey
* @description 针对表【sip_photo_color(背景颜色表)】的数据库操作Mapper
* @createDate 2025-07-07 19:56:23
* @Entity cn.oldbaby.sip.common.SipPhotoColor
*/
public interface SipPhotoColorMapper {

    int deleteByPrimaryKey(Long id);

    int insert(SipPhotoColor record);

    int insertSelective(SipPhotoColor record);

    SipPhotoColor selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SipPhotoColor record);

    int updateByPrimaryKey(SipPhotoColor record);

    List<SipPhotoColor> selectList(SipPhotoColor record);

}
