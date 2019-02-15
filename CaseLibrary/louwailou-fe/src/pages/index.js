import styles from './index.css';
import { Layout } from 'antd';
import ClientList from '../components/ClientList';
import SideMenu from '../components/SideMenu';
import React from 'react';
import { connect } from 'dva';

const {
  Header, Footer, Sider, Content,
} = Layout;

const contentView = <ClientList/>;

const Index = ({ dispatch, users }) => {
  function handleDelete(id) {
    dispatch({
      type: 'products/delete',
      payload: id,
    });
  }
  return (
    <div className={styles.normal}>
      <Layout>
        <Header className={styles.header}>Header</Header>
        <Layout>
          <Sider className={styles.sider}><SideMenu/></Sider>
          <Content className={styles.content}>
            {contentView}
          </Content>
        </Layout>
        <Footer className={styles.footer}>Footer</Footer>
      </Layout>
    </div>
  );
};

export default connect(({ users }) => ({
  users,
}))(Index);
