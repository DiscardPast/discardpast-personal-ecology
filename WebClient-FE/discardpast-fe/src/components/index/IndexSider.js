import {Menu} from 'antd';
import React from 'react';

const InputSider = () => {
  return(
    <Menu theme="dark" mode="inline" defaultSelectedKeys={['1']}>
      <Menu.Item key="1">
        <span>房源列表</span>
      </Menu.Item>
      <Menu.Item key="2">
        <span>用户列表</span>
      </Menu.Item>
      <Menu.Item key="3">
        <span>置业顾问列表</span>
      </Menu.Item>
      <Menu.Item key="4">
        <span>员工列表</span>
      </Menu.Item>
    </Menu>
  )
}

export default InputSider
