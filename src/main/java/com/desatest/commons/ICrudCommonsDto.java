package com.desatest.commons;

public interface ICrudCommonsDto<DTOReq, DTOResp, ID> {
    public DTOResp save(DTOReq entity);
    public DTOResp update(ID id, DTOReq entity);
    public DTOResp finById(ID id);
    public DTOResp delete(ID id);
}
