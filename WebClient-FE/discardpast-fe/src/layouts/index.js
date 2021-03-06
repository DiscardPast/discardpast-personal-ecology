import styles from './index.css';
import React from 'react';


function BasicLayout(props) {
  return (
    <div className={styles.normal}>
      { props.children }
    </div>
  );
}

export default BasicLayout;
