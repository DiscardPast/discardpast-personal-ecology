import ClientList from '@/components/ClientList';
import React from 'react';

export default {
  namespace: 'indexContentValue',
  state: <ClientList/>,
  reducers: {
    'delete'(state, { payload: id }) {
      return state.filter(item => item.id !== id);
    },
  },
};
