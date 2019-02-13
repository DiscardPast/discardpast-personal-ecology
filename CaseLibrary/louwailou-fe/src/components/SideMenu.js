import { Menu, Icon } from 'antd';
import React from 'react';
import ClientList from '@/components/ClientList';


class SideMenu extends React.Component {

  indexContentValueClientList = () => {
    return <ClientList/>
  };

  render() {
    return (
      <div style={{ width: 200 }}>
        <Menu
          defaultSelectedKeys={['1']}
          defaultOpenKeys={['sub1']}
          mode="inline"
          theme="dark"
        >
          <Menu.Item key="1" onClick={this.indexContentValueClientList}>
            <Icon type="pie-chart" />
            <span>客户列表</span>
          </Menu.Item>
          <Menu.Item key="2">
            <Icon type="desktop" />
            <span>员工列表</span>
          </Menu.Item>
          <Menu.Item key="3">
          <Icon type="inbox" />
          <span>房源列表</span>
        </Menu.Item>
          <Menu.Item key="4">
            <Icon type="inbox" />
            <span>置业顾问列表</span>
          </Menu.Item>
        </Menu>
      </div>
    );
  }
}

export default SideMenu;
