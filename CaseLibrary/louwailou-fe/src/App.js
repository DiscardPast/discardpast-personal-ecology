export const dva = {
  config: {
    onError(err) {
      err.preventDefault();
      console.error(err.message);
    },
    initialState: {
      clients: [
        { name: 'dva', id: 1 },
        { name: 'antd', id: 2 },
      ],
      users: [
        { name: 'dva', id: 1 },
        { name: 'antd', id: 2 },
        { name: 'antd', id: 2 },
        { name: 'antd', id: 2 },
        { name: 'antd', id: 2 },
        { name: 'antd', id: 2 },

      ],
    },
  },
};
