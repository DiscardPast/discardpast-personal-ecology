import { connect } from 'dva';
import ClientList from '../components/ClientList';
import React from 'react';

const Clients = ({ dispatch, clients }) => {
  function handleDelete(id) {
    dispatch({
      type: 'products/delete',
      payload: id,
    });
  }
  return (
    <div>
      <h2>List of Products</h2>
      <ClientList onDelete={handleDelete} clients={clients} />
    </div>
  );
};

export default connect(({ clients }) => ({
  clients,
}))(Clients);
