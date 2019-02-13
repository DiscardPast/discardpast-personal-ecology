import { connect } from 'dva';
import UserList from '../components/UserList';

const Clients = ({ dispatch, users }) => {
  function handleDelete(id) {
    dispatch({
      type: 'products/delete',
      payload: id,
    });
  }
  return (
    <div>
      <h2>List of Products</h2>
      <UserList onDelete={handleDelete} users={users} />
    </div>
  );
};

export default connect(({ users }) => ({
  users,
}))(Clients);
