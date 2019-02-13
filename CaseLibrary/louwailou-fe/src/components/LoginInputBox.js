import { Input } from 'antd';
import { Button } from 'antd';
import React from 'react';
import styles from './LoginInputBox.css';

const onChange = (e) => {
  console.log(e);
};

const LoginInputBox = () => {
  return(
    <div className={styles.loginInputBox_bg}>
      <div className={styles.loginInputView}>
      <Input placeholder="请输入用户名" allowClear onChange={onChange} />
      <Input placeholder="请输入密码" allowClear onChange={onChange} />
      </div>
      <div className={styles.loginInputConfirmView}>
        <Button className={styles.loginInputConfirmButton} type="primary">确定</Button>
        <Button className={styles.loginInputConfirmButton} type="danger">重置</Button>
      </div>
    </div>
  )
};

export default LoginInputBox;
