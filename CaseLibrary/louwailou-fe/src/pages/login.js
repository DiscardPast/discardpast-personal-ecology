
import styles from './login.css';
import LoginInputBox from '../components/LoginInputBox';
import React from 'react';

export default function() {
  return (
    <div className={styles.normal}>
      <h1>楼外楼后台管理系统</h1>
      <div className={styles.login_bg}>
        <LoginInputBox/>
      </div>
    </div>
  );
}
