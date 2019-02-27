import {Table,Popconfirm,Button,Input} from 'antd';
import React from 'react';

const HouseList = ({onDelete}) => {
  const Search = Input.Search;
  const columns = [{
    title: '房源标题',
    dataIndex: 'houseTitle',
    key: 'houseTitle',
    render: text => <a href="#">{text}</a>,
  },{
    title: '房源描述'
  },{
    title: '跟进人',
    defaultSortOrder: 'deass',
    sort: (a,b) => a.length() > b.length(),
  },{
    title: '删除',
    render: (text,record) => {
      return (
        <Popconfirm title="Delete?" onConfirm={() => onDelete(record.id)}>
          <Button htmlType={Button}>Delete</Button>
        </Popconfirm>
      )
    }
  },{
    title: '修改',
    render: (text,record) => {
      return (
        <Popconfirm title="Change?" onConfirm={() => onDelete(record.id)}>
          <Button htmlType={Button}>Change</Button>
        </Popconfirm>
      )
    }
  },{
    title: () => {
      return(
        <Button htmlType={Button}><a href='/housedetails'>添加</a></Button>
      )
    }},{
    title: () => {
      return (
        <Search
          placeholder="input search text"
          onSearch={value => console.log(value)}
          style={{ width: 200 }}
          enterButton
        />
      )
    }
  }];

  const dataSource =  [{
    key: '1',
  }, {
    key: '2',
  }, {
    key: '2',
  }, {
    key: '2',
  }, {
    key: '2',
  }, {
    key: '2',
  }, {
    key: '2',
  }];

  return (
    <Table
      dataSource={dataSource}
      columns={columns}
    />
  )
}

export default HouseList;
