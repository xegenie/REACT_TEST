import React from 'react'
import { Link } from 'react-router-dom'

const Home = () => {
  return (
    <>
    <div className='container'>
      <h1>Board App</h1>
      <h2>* 게시판 앱</h2>
      <Link to="/boards" className='btn'>게시판</Link>
      <h2>* TODO 앱</h2>
      <Link to="/todos" className='btn'>TODO LIST</Link>
    </div>
    </>
  )
}

export default Home