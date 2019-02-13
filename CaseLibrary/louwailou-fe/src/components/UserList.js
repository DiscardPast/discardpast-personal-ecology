import { Table, Popconfirm, Button } from 'antd';
import styles from './UserList.css';

const ClientList = ({ onDelete, users }) => {
  const columns = [{
    title: 'Name',
    dataIndex: 'name',
  }, {
    title: 'Actions',
    render: (text, record) => {
      return (
        <Popconfirm title="Delete?" onConfirm={() => onDelete(record.id)}>
          <Button>Delete</Button>
        </Popconfirm>
      );
    },
  }];
  return (
    <Table
      dataSource={users}
      columns={columns}
    />
  );
};

export default ClientList;
