import { Input } from 'antd';
import styles from './InputStyle.css';
import React from 'react';

const InputStyle = ({labelText,innerText}) => {
  return (
    <div className={styles.inputbg}>
      <label className={styles.labelstyle}>{labelText}</label>
      <Input placeholder={innerText} />
    </div>
  )
}

export default InputStyle
