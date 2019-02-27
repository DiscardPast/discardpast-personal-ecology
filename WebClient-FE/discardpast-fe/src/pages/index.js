import styles from './index.css';
import { Layout } from 'antd';
import React from 'react';
import IndexHeader from '@/components/index/IndexHeader';
import InputSider from '@/components/index/IndexSider';
import IndexFooter from '@/components/index/IndexFooter';
import HouseList from '@/components/house/HouseList';

export default function() {

  const {
    Header, Content, Footer, Sider,
  } = Layout;

  return (
  <Layout>
    <Header style={{ background: '#fff', padding: 0 }}>
      <IndexHeader/>
    </Header>
    <Layout>
      <Sider><InputSider/></Sider>
      <Content><HouseList/></Content>
    </Layout>
    <Footer><IndexFooter/></Footer>
  </Layout>
  );
}
