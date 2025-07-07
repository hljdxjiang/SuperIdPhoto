package cn.oldbaby.sip.common.mapper;

import cn.oldbaby.sip.common.domain.SipPhotoParam;

import java.util.List;

/**
* @author mickey
* @description 针对表【sip_photo_param(照片参数表)】的数据库操作Mapper
* @createDate 2025-07-07 19:56:23
* @Entity cn.oldbaby.sip.common.SipPhotoParam
*/
public interface SipPhotoParamMapper {

    int deleteByPrimaryKey(Long id);

    int insert(SipPhotoParam record);

    int insertSelective(SipPhotoParam record);

    SipPhotoParam selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SipPhotoParam record);

    int updateByPrimaryKey(SipPhotoParam record);

    List<SipPhotoParam> selectList(SipPhotoParam record);


}
