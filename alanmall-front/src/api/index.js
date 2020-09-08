import http from './public'
import {apis} from './api'

// http://localhost:8082/test
export const getAllTest = () => {
    return http.fetchGet(apis.test)
}

export const userInfo = (params) => {
    return http.fetchGet(apis.userInfo, params)
  }

export const userLogin = () => {
    return http.fetchGet(apis.login)
}

